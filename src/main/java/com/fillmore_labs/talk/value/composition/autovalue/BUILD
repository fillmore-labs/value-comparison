load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "autovalue",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.AutoValue_[^.]+$$"],
    visibility = ["//visibility:public"],
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/autovalue",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/autovalue",
        "//toolchain:autovalue",
        "//toolchain:checker",
    ],
)
