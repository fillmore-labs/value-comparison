workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "c6966ec828da198c5d9adbaa94c05e3a1c7f21bd012a0b29ba8ddbccb2c93b0d",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.1.1/bazel-skylib-1.1.1.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.1.1/bazel-skylib-1.1.1.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "2b1641428dff9018f9e85c0384f03ec6c10660d935b750e3fa1492a281a53b0f",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.29.0/rules_go-v0.29.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.29.0/rules_go-v0.29.0.zip",
    ],
)

http_archive(
    name = "bazel_gazelle",
    sha256 = "de69a09dc70417580aabf20a28619bb3ef60d038470c7cf8442fafcf627c21cb",
    urls = [
        "https://github.com/bazelbuild/bazel-gazelle/releases/download/v0.24.0/bazel-gazelle-v0.24.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-gazelle/releases/download/v0.24.0/bazel-gazelle-v0.24.0.tar.gz",
    ],
)

http_archive(
    name = "rules_proto",
    sha256 = "66bfdf8782796239d3875d37e7de19b1d94301e8972b3cbd2446b332429b4df1",
    strip_prefix = "rules_proto-4.0.0",
    urls = [
        "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
    ],
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "4a045294ec76cb6eae990a21adb5d8b3c78be486f1507faa601541d1ccefbd6b",
    strip_prefix = "protobuf-3.19.0",
    urls = ["https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.19.0.tar.gz"],
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "ae34c344514e08c23e90da0e2d6cb700fcd28e80c02e23e4d5715dddcb42f7b3",
    strip_prefix = "buildtools-4.2.2",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/4.2.2.tar.gz",
)

http_archive(
    name = "io_bazel_rules_docker",
    sha256 = "92779d3445e7bdc79b961030b996cb0c91820ade7ffa7edca69273f404b085d5",
    strip_prefix = "rules_docker-0.20.0",
    urls = ["https://github.com/bazelbuild/rules_docker/releases/download/v0.20.0/rules_docker-v0.20.0.tar.gz"],
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "995ea6b5f41e14e1a17088b727dcff342b2c6534104e73d6f06f1ae0422c2308",
    strip_prefix = "rules_jvm_external-4.1",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.1.tar.gz",
)

http_archive(
    name = "google_bazel_common",
    sha256 = "10da34d97f282b60078e472407a23fb505565cf398da578b800572ccce20b468",
    strip_prefix = "bazel-common-efc6731b1d72535f3009061af87538a0a826f3fc",
    urls = ["https://github.com/google/bazel-common/archive/efc6731b1d72535f3009061af87538a0a826f3fc.tar.gz"],
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "72e54a8e52a02b6c4f52b24000b9f631f9f9764f4626016952f36143dae10362",
    strip_prefix = "rules_scala-e4560ac332e9da731c1e50a76af2579c55836a5c",
    url = "https://github.com/bazelbuild/rules_scala/archive/e4560ac332e9da731c1e50a76af2579c55836a5c.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "6cbd4e5768bdfae1598662e40272729ec9ece8b7bded8f0d2c81c8ff96dc139d",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/v1.5.0-beta-4/rules_kotlin_release.tgz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.17.2")

go_rules_dependencies()

# ---

load("@bazel_gazelle//:deps.bzl", "gazelle_dependencies")

gazelle_dependencies()

# ---

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# ---

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

# ---

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")

scala_config(scala_version = "2.13.7")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

scala_repositories(
    fetch_sources = True,
    overriden_artifacts = {
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.7",
            "sha256": "a8bc08f3b9ff93d0496032bf2677163071b8d212992f41dbf04212e07d91616b",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.7",
            "sha256": "a7bc4eca6970083d426a8d081aec313c7b7207d5f83b6724995e34078edc5cbb",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
        },
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.7",
            "sha256": "a450602f03a4686919e60d1aeced549559f1eaffbaf30ffa7987c8d97e3e79a9",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
        },
    },
)

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains", "scala_register_unused_deps_toolchains")

scala_register_toolchains()

scala_register_unused_deps_toolchains()

# ---

load("@io_bazel_rules_kotlin//kotlin:repositories.bzl", "kotlin_repositories")

kotlin_repositories()

load("@io_bazel_rules_kotlin//kotlin:core.bzl", "kt_register_toolchains")

kt_register_toolchains()

# ---

load("@google_bazel_common//:workspace_defs.bzl", "google_common_workspace_rules")

google_common_workspace_rules()

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")
load("@rules_jvm_external//:specs.bzl", "maven")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value-annotations:1.8.2",
        "com.google.auto.value:auto-value:1.8.2",
        "com.google.errorprone:error_prone_annotations:2.10.0",
        "com.google.flogger:flogger-system-backend:0.7.1",
        "com.google.flogger:flogger:0.7.1",
        "com.google.guava:guava:31.0.1-jre",
        "com.uber.nullaway:nullaway:0.9.2",
        "commons-validator:commons-validator:1.7",
        "org.checkerframework:checker-qual:3.19.0",
        "org.immutables:value-annotations:2.9.0-rc1",
        "org.immutables:value-processor:2.9.0-rc1",
        "org.inferred:freebuilder:2.7.0",
        "org.projectlombok:lombok:1.18.22",
        maven.artifact(
            "com.google.truth",
            "truth",
            "1.1.3",
            testonly = True,
        ),
        maven.artifact(
            "com.google.truth.extensions",
            "truth-java8-extension",
            "1.1.3",
            testonly = True,
        ),
        maven.artifact(
            "junit",
            "junit",
            "4.13.2",
            testonly = True,
        ),
        maven.artifact(
            "org.ow2.asm",
            "asm",
            "9.2",
            testonly = True,
        ),
    ],
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    override_targets = {
        "org.scala-lang:scala-library": "@io_bazel_rules_scala_scala_library",
        "org.scala-lang:scala-reflect": "@io_bazel_rules_scala_scala_reflect",
        "org.scala-lang:scala-compiler": "@io_bazel_rules_scala_scala_compiler",
    },
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://repo.maven.apache.org/maven2",
        "https://maven-central-eu.storage-download.googleapis.com/maven2",
    ],
)

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
