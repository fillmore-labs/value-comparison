workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "bc283cdfcd526a52c3201279cda4bc298652efa898b10b4db0837dc51652756f",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.7.1/bazel-skylib-1.7.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.7.1/bazel-skylib-1.7.1.tar.gz",
    ],
)

http_archive(
    name = "rules_java",
    sha256 = "4fe4b1dc87b5a95cb8bc294e1b13c585d9a8f5a6c84c157d2f1b1291d18ed9f0",
    url = "https://github.com/bazelbuild/rules_java/releases/download/7.6.3/rules_java-7.6.3.tar.gz",
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "33acc4ae0f70502db4b893c9fc1dd7a9bf998c23e7ff2c4517741d4049a976f8",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.48.0/rules_go-v0.48.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.48.0/rules_go-v0.48.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "d76bf7a60fd8b050444090dfa2837a4eaf9829e1165618ee35dceca5cbdf58d5",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.37.0/bazel-gazelle-v0.37.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.37.0/bazel-gazelle-v0.37.0.tar.gz",
    ],
)

http_archive(
    name = "rules_pkg",
    sha256 = "d250924a2ecc5176808fc4c25d5cf5e9e79e6346d79d5ab1c493e289e722d1d0",
    urls = [
        "https://github.com/bazelbuild/rules_pkg/releases/download/0.10.1/rules_pkg-0.10.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/0.10.1/rules_pkg-0.10.1.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "303e86e722a520f6f326a50b41cfc16b98fe6d1955ce46642a5b7a67c11c0f5d",
    strip_prefix = "rules_proto-6.0.0",
    url = "https://github.com/bazelbuild/rules_proto/archive/refs/tags/6.0.0.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "39c59cb5352892292cbe3174055aac187edcb5324c9b4e2d96cb6e40bd753877",
    strip_prefix = "buildtools-7.1.2",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/v7.1.2.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "08ea921df02ffe9924123b0686dc04fd0ff875710bfadb7ad42badb931b0fd50",
    strip_prefix = "rules_jvm_external-6.1",
    url = "https://github.com/bazelbuild/rules_jvm_external/releases/download/6.1/rules_jvm_external-6.1.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "3b00fa0b243b04565abb17d3839a5f4fa6cc2cac571f6db9f83c1982ba1e19e5",
    strip_prefix = "rules_scala-6.5.0",
    url = "https://github.com/bazelbuild/rules_scala/releases/download/v6.5.0/rules_scala-v6.5.0.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "34e8c0351764b71d78f76c8746e98063979ce08dcf1a91666f3f3bc2949a533d",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/v1.9.5/rules_kotlin-v1.9.5.tar.gz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@rules_java//java:repositories.bzl", "rules_java_dependencies", "rules_java_toolchains")

rules_java_dependencies()

rules_java_toolchains()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.21.6")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()

# ---

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

# ---

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# ---

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.12")

load("@io_bazel_rules_scala//scala:scala.bzl", "rules_scala_setup", "rules_scala_toolchain_deps_repositories")

rules_scala_setup()

rules_scala_toolchain_deps_repositories(fetch_sources = True)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains", "scala_register_unused_deps_toolchains")

scala_register_toolchains()

scala_register_unused_deps_toolchains()

# ---

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")

kotlin_repositories()

register_toolchains("//toolchain:kotlin_toolchain")

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("//toolchain:defs.bzl", "testonly_artifacts")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value-annotations:1.11.0",
        "com.google.auto.value:auto-value:1.11.0",
        "com.google.errorprone:error_prone_annotations:2.28.0",
        "com.google.flogger:flogger-system-backend:0.8",
        "com.google.flogger:flogger:0.8",
        "com.google.guava:guava:33.2.1-jre",
        "commons-validator:commons-validator:1.9.0",
        "org.checkerframework:checker-qual:3.43.0",
        "org.checkerframework:checker-qual:3.43.0",
        "org.checkerframework:checker-util:3.43.0",
        "org.checkerframework:checker:3.44.0",
        "org.immutables:value-annotations:2.10.1",
        "org.immutables:value-processor:2.10.1",
        "org.inferred:freebuilder:2.8.0",
        "org.projectlombok:lombok:1.18.32",
    ] + testonly_artifacts([
        "com.google.truth.extensions:truth-java8-extension:1.2.0",
        "com.google.truth:truth:1.2.0",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.15.6",
    ]),
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    override_targets = {
        "com.google.protobuf:protobuf-java": "@com_google_protobuf//:protobuf_java",
        "com.google.protobuf:protobuf-java-util": "@com_google_protobuf//:protobuf_java_util",
        "org.scala-lang:scala-compiler": "@io_bazel_rules_scala_scala_compiler",
        "org.scala-lang:scala-library": "@io_bazel_rules_scala_scala_library",
        "org.scala-lang:scala-reflect": "@io_bazel_rules_scala_scala_reflect",
    },
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://repo.maven.apache.org/maven2",
        "https://maven-central-eu.storage-download.googleapis.com/maven2",
    ],
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
