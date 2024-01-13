load("@rules_java//java:defs.bzl", "java_library")
load("//toolchain:java_library_without_header_compilation.bzl", "java_library_without_header_compilation")

java_library_without_header_compilation(
    name = "lombok",
    dep = ":lombok_impl",
    visibility = ["//visibility:public"],
)

java_library(
    name = "lombok_impl",
    srcs = glob(["*.java"]),
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/lombok",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/lombok",
        "//toolchain:checker",
        "//toolchain:lombok",
    ],
)
