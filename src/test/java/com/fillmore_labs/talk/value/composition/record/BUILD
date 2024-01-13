load("@rules_java//java:defs.bzl", "java_library", "java_test")

java_library(
    name = "tests",
    testonly = True,
    srcs = glob(["*.java"]),
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/composition/record",
        "//toolchain:checker",
        "//toolchain:truth",
        "@maven//:com_google_guava_guava",
    ],
)

java_test(
    name = "MovieTicketTest",
    size = "small",
    runtime_deps = [
        ":tests",
    ],
)
