load("@com_github_bazelbuild_buildtools//buildifier:def.bzl", "buildifier")
load("@rules_java//java:defs.bzl", "java_binary")

exports_files(["lombok.config"])

java_binary(
    name = "value-comparison",
    data = ["//conf:logging"],
    jvm_flags = ["-Djava.util.logging.config.file=$(rootpath //conf:logging)"],
    main_class = "com.fillmore_labs.talk.value.Main",
    runtime_deps = [
        "//src/main/java/com/fillmore_labs/talk/value",
        "@maven//:com_google_flogger_flogger_system_backend",
    ],
)

buildifier(
    name = "lint_fix",
    lint_mode = "fix",
    lint_warnings = ["all"],
    mode = "fix",
)
