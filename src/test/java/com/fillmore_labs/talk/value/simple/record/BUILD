load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_library(
    name = "tests",
    testonly = True,
    srcs = glob(["*.java"]),
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/record",
        "//toolchain:nullaway",
        "//toolchain:truth",
    ],
)

java_test(
    name = "EmailAddressTest",
    size = "small",
    runtime_deps = [
        ":tests",
    ],
)

java_test(
    name = "PersonTest",
    size = "small",
    runtime_deps = [
        ":tests",
    ],
)
