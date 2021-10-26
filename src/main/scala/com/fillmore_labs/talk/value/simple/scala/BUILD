load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "scala",
    srcs = glob(["*.scala"]),
    scalacopts = ["-deprecation"],
    visibility = ["//visibility:public"],
    deps = [
        "@maven//:commons_validator_commons_validator",
        "@maven//:org_checkerframework_checker_qual",
    ],
)
