load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "record",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.AutoBuilder_[^.]+$$"],
    visibility = ["//visibility:public"],
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/record",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/record",
        "//toolchain:autovalue",
        "//toolchain:checker",
    ],
)
