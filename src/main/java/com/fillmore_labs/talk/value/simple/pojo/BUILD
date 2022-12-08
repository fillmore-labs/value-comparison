load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "pojo",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//toolchain:autovalue",
        "//toolchain:nullaway",
        "@maven//:com_google_guava_guava",
        "@maven//:commons_validator_commons_validator",
    ],
)
