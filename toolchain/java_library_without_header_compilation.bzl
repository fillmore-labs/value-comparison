""" Disable `--java_header_compilation` using a configuration transition. """
#
# Credits: Liam Miller-Cushon <cushon@google.com>
# https://github.com/bazelbuild/bazel/issues/12837#issuecomment-766155870
#

def _java_header_compilation_transition(settings, attr):
    _ignore = (settings, attr)
    return {"//command_line_option:java_header_compilation": "False"}

java_header_compilation_transition = transition(
    implementation = _java_header_compilation_transition,
    inputs = [],
    outputs = ["//command_line_option:java_header_compilation"],
)

def _java_library_without_header_compilation(ctx):
    return [java_common.merge([d[JavaInfo] for d in ctx.attr.dep])]

java_library_without_header_compilation = rule(
    implementation = _java_library_without_header_compilation,
    attrs = {
        "dep": attr.label(
            providers = [JavaInfo],
            mandatory = True,
            cfg = java_header_compilation_transition,
        ),
        "_allowlist_function_transition": attr.label(
            default = "@bazel_tools//tools/allowlists/function_transition_allowlist",
        ),
    },
)
