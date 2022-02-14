workspace(name = "com_fillmore_labs_value_comparison")

register_toolchains("//toolchain:toolchain_java17_definition")

register_toolchains("//toolchain:scala213_toolchain")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "bazel_skylib",
    sha256 = "af87959afe497dc8dfd4c6cb66e1279cb98ccc84284619ebfec27d9c09a903de",
    urls = [
        "https://github.com/bazelbuild/bazel-skylib/releases/download/1.2.0/bazel-skylib-1.2.0.tar.gz",
        "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/1.2.0/bazel-skylib-1.2.0.tar.gz",
    ],
)

http_archive(
    name = "io_bazel_rules_go",
    sha256 = "d6b2513456fe2229811da7eb67a444be7785f5323c6708b38d851d2b51e54d83",
    urls = [
        "https://github.com/bazelbuild/rules_go/releases/download/v0.30.0/rules_go-v0.30.0.zip",
        "https://mirror.bazel.build/github.com/bazelbuild/rules_go/releases/download/v0.30.0/rules_go-v0.30.0.zip",
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
    url = "https://github.com/bazelbuild/rules_proto/archive/refs/tags/4.0.0.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "390191a0d7884b3e52bb812c440ad1497b9d484241f37bb8e2ccc8c2b72d6c36",
    strip_prefix = "protobuf-3.19.3",
    url = "https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.19.3.tar.gz",
)

http_archive(
    name = "com_github_bazelbuild_buildtools",
    sha256 = "d368c47bbfc055010f118efb2962987475418737e901f7782d2a966d1dc80296",
    strip_prefix = "buildtools-4.2.5",
    url = "https://github.com/bazelbuild/buildtools/archive/refs/tags/4.2.5.tar.gz",
)

http_archive(
    name = "rules_jvm_external",
    sha256 = "2cd77de091e5376afaf9cc391c15f093ebd0105192373b334f0a855d89092ad5",
    strip_prefix = "rules_jvm_external-4.2",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.2.tar.gz",
)

http_archive(
    name = "google_bazel_common",
    sha256 = "b4165070a44b3929513c4797d5dcc034916aeac105a3d30c840cf8dc0156117b",
    strip_prefix = "bazel-common-bf8e5ef95b118d1716b0cb4982cf15b6ed1c896f",
    url = "https://github.com/google/bazel-common/archive/bf8e5ef95b118d1716b0cb4982cf15b6ed1c896f.tar.gz",
)

http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "abb59c4e59e5edbeadc3ce708b400267ae572fcd72756e72c3b684603d08ac0c",
    strip_prefix = "rules_scala-ca2ed2778419fac83ffe32b9207c2d77cce55a6f",
    url = "https://github.com/bazelbuild/rules_scala/archive/ca2ed2778419fac83ffe32b9207c2d77cce55a6f.tar.gz",
)

http_archive(
    name = "io_bazel_rules_kotlin",
    sha256 = "12d22a3d9cbcf00f2e2d8f0683ba87d3823cb8c7f6837568dd7e48846e023307",
    url = "https://github.com/bazelbuild/rules_kotlin/releases/download/v1.5.0/rules_kotlin_release.tgz",
)

# ---

load("@bazel_skylib//:workspace.bzl", "bazel_skylib_workspace")

bazel_skylib_workspace()

# ---

load("@io_bazel_rules_go//go:deps.bzl", "go_register_toolchains", "go_rules_dependencies")

go_register_toolchains(go_version = "1.17.6")

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
        "io_bazel_rules_scala_scala_compiler": {
            "artifact": "org.scala-lang:scala-compiler:2.13.7",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
                "@io_bazel_rules_scala_scala_reflect",
            ],
            "sha256": "a450602f03a4686919e60d1aeced549559f1eaffbaf30ffa7987c8d97e3e79a9",
        },
        "io_bazel_rules_scala_scala_library": {
            "artifact": "org.scala-lang:scala-library:2.13.7",
            "sha256": "a8bc08f3b9ff93d0496032bf2677163071b8d212992f41dbf04212e07d91616b",
        },
        "io_bazel_rules_scala_scala_reflect": {
            "artifact": "org.scala-lang:scala-reflect:2.13.7",
            "deps": [
                "@io_bazel_rules_scala_scala_library",
            ],
            "sha256": "a7bc4eca6970083d426a8d081aec313c7b7207d5f83b6724995e34078edc5cbb",
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
load("//toolchain:defs.bzl", "testonly_artifacts")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value-annotations:1.9",
        "com.google.auto.value:auto-value:1.9",
        "com.google.errorprone:error_prone_annotations:2.10.0",
        "com.google.flogger:flogger-system-backend:0.7.4",
        "com.google.flogger:flogger:0.7.4",
        "com.google.guava:guava:31.0.1-jre",
        "com.uber.nullaway:nullaway:0.9.5",
        "commons-validator:commons-validator:1.7",
        "org.checkerframework:checker-qual:3.21.1",
        "org.immutables:value-annotations:2.9.0-rc1",
        "org.immutables:value-processor:2.9.0-rc1",
        "org.inferred:freebuilder:2.7.0",
        "org.projectlombok:lombok:1.18.22",
    ] + testonly_artifacts([
        "com.google.truth.extensions:truth-java8-extension:1.1.3",
        "com.google.truth:truth:1.1.3",
        "junit:junit:4.13.2",
        "nl.jqno.equalsverifier:equalsverifier:3.8.2",
    ]),
    fetch_sources = True,
    maven_install_json = "//:maven_install.json",
    override_targets = {
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
