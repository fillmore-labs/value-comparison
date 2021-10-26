load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "lombok",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/lombok",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/lombok",
        "//toolchain:lombok",
        "//toolchain:nullaway",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
    ],
)
