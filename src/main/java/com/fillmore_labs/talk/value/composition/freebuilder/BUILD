load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "freebuilder",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    exports = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/freebuilder",
    ],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/freebuilder",
        "//toolchain:freebuilder",
        "//toolchain:nullaway",
        "@maven//:com_google_guava_guava",
    ],
)
