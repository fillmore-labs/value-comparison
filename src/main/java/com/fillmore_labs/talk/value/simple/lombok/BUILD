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
    deps = [
        "//toolchain:lombok",
        "//toolchain:nullaway",
        "@maven//:com_google_guava_guava",
        "@maven//:commons_validator_commons_validator",
    ],
)
