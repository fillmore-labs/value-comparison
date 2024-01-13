load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "record",
    srcs = glob(["*.java"]),
    javacopts = ["-AskipDefs=\\.AutoBuilder_[^.]+$$"],
    visibility = ["//visibility:public"],
    deps = [
        "//toolchain:autovalue",
        "//toolchain:checker",
        "@maven//:com_google_guava_guava",
        "@maven//:commons_validator_commons_validator",
    ],
)
