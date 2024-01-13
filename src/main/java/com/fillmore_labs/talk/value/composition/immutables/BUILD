load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "immutables",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.Immutable[^.]+$$"],
    visibility = ["//visibility:public"],
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/immutables",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/immutables",
        "//toolchain:checker",
        "//toolchain:immutables",
        "@maven//:com_google_code_findbugs_jsr305",
        "@maven//:com_google_guava_guava",
    ],
)
