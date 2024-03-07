Quick Start[(中文)](./README-CN.md)

--- 

# Zenlayer Cloud SDK Java

[![Maven Central](https://img.shields.io/maven-central/v/com.zenlayer/zenlayercloud-sdk-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:com.zenlayer%20AND%20a:zenlayercloud-sdk-java)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

# Introduction

Welcome to Zenlayer Cloud API Software Developer Kit (SDK). SDK is a supporting tool for Zenlayer Cloud API. It currently supports Bare
Metal Instance, Elastic IP, DDoS Protected IP and other products. More cloud services will be supported for SDK.

# Requirements

1. The Java environment is installed. Java Development Kit (JDK) version 1.7 or later is used.
2. A Zenlayer Cloud account is created and an Access Key ID and an Access Key Password are created.
   See [Generate an API Access Key](https://docs.console.zenlayer.com/welcome/platform/team-management/generate-an-api-access-key) for more
   details.

# Installation with maven (Recommended)

If you use Maven to manage Java projects, you can add Maven dependencies to the pom.xml file to install Zenlayer Cloud SDK for Java. In the
Maven repository, you can view the Maven dependencies of Zenlayer Cloud services.
Add the following Maven dependency to install the core library of Zenlayer Cloud SDK for Java.

```xml

<dependency>
    <groupId>com.zenlayer</groupId>
   <artifactId>zenlayercloud-sdk-java</artifactId>
   <!-- Go to https://search.maven.org/search?q=zenlayercloud-sdk-java to check all new versions. The latest version: -->
   <version>0.6.1</version>
</dependency>

```

# Examples

Take CreateInstances as an example.

```java
import com.zenlayercloud.bmc20221120.BmcClient;
import com.zenlayercloud.bmc20221120.models.CreateInstancesRequest;
import com.zenlayercloud.bmc20221120.models.CreateInstancesResponse;
import com.zenlayercloud.common.Credential;
import com.zenlayercloud.common.ZenlayerSdkException;

public class Example {

    public static void main(String[] args) {
        // 1. Initialize client
        Credential credential = new Credential("your accessKeyId", "your accessKey password");
        BmcClient client = new BmcClient(credential);
        // 2. Set API request parameters
        CreateInstancesRequest createInstancesRequest = new CreateInstancesRequest();
        createInstancesRequest.instanceChargeType = "PREPAID";
        createInstancesRequest.internetChargeType = "ByBandwidth";
        createInstancesRequest.zoneId = "SEL-A";
        createInstancesRequest.instanceTypeId = "M8C";

        try {
            // 3. Make an API request and get the response result
            CreateInstancesResponse instances = client.createInstances(createInstancesRequest);

        } catch (ZenlayerSdkException e) {
            // 4. Handle errors in response
        }
    }
}
```

---
Quick Start[(Chinese)](./README-CN.md)
