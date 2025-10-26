## Use Microsoft's devcontainer base for Java 21 which includes OpenJDK 21

# Use the official Eclipse Temurin Java 21 JDK image which is widely available
FROM eclipse-temurin:21-jdk

# Install common build tools: maven, gradle, git, curl, unzip, and sudo
RUN apt-get update \
    && apt-get install -y --no-install-recommends \
       maven \
       gradle \
       git \
       unzip \
       curl \
       sudo \
    && rm -rf /var/lib/apt/lists/*

# Set JAVA_HOME to the Temurin installation path and ensure it's on PATH
ENV JAVA_HOME=/opt/java/openjdk
ENV PATH="$JAVA_HOME/bin:$PATH"

# Set working directory to the default Codespaces workspace folder
WORKDIR /workspaces/Adv_Software_Design
