load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "value",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/java/com/fillmore_labs/talk/value/simple/autovalue",
        "//src/main/java/com/fillmore_labs/talk/value/simple/freebuilder",
        "//src/main/java/com/fillmore_labs/talk/value/simple/immutables",
        "//src/main/java/com/fillmore_labs/talk/value/simple/lombok",
        "//src/main/java/com/fillmore_labs/talk/value/simple/pojo",
        "//src/main/java/com/fillmore_labs/talk/value/simple/record",
        "//src/main/kotlin/com/fillmore_labs/talk/value/simple/kotlin",
        "//src/main/scala/com/fillmore_labs/talk/value/simple/scala",
        "//toolchain:checker",
        "@maven//:com_google_flogger_flogger",
    ],
)
