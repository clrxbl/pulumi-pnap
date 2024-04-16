<h1 align="center">
  <br>
  <a href="https://phoenixnap.com/bare-metal-cloud"><img src="https://user-images.githubusercontent.com/78744488/109779287-16da8600-7c06-11eb-81a1-97bf44983d33.png" alt="phoenixnap Bare Metal Cloud" width="300"></a>
  <br>
  Pulumi phoenixNAP Provider
  <br>
</h1>

<p align="center">
The <a href="https://pulumi.com">Pulumi</a> phoenixNAP provider makes it easy to deploy and manage your <a href="https://phoenixnap.com/bare-metal-cloud">Bare Metal Cloud</a> infrastructure with familiar programming languages such as JavaScript or Python.
</p>

<p align="center">
  <a href="https://phoenixnap.com/bare-metal-cloud">Bare Metal Cloud</a> •
  <a href="https://www.pulumi.com/">Pulumi</a> •
  <a href="https://developers.phoenixnap.com/">Developers Portal</a> •
  <a href="http://phoenixnap.com/kb">Knowledge Base</a> •
  <a href="https://developers.phoenixnap.com/support">Support</a>
</p>

<p align="center">
  <a href="https://badge.fury.io/js/pulumi-pnap"><img src="https://badge.fury.io/js/pulumi-pnap.png" alt="npm version" height="18"></a>
  <a href="https://badge.fury.io/py/pulumi-pnap"><img src="https://badge.fury.io/py/pulumi-pnap.svg" alt="PyPI version" height="18"></a>
  <a href="https://badge.fury.io/nu/pulumi-pnap"><img src="https://badge.fury.io/nu/pulumi-pnap.svg" alt="NuGet version" height="18"></a>
</p>


## Requirements
-	[Bare Metal Cloud](https://bmc.phoenixnap.com) account
-	Pulumi CLI

## Creating a Bare Metal Cloud account
You need to have a Bare Metal Cloud account in order to use the ***pnap*** Pulumi provider with Bare Metal Cloud. 

1. Go to the [Bare Metal Cloud signup page](https://support.phoenixnap.com/wap-jpost3/bmcSignup).
2. Follow the prompts to set up your account.
3. Use your credentials to [log in to Bare Metal Cloud portal](https://bmc.phoenixnap.com).

:arrow_forward: **Video tutorial:** [How to Create a Bare Metal Cloud Account](https://www.youtube.com/watch?v=RLRQOisEB-k)
<br>

:arrow_forward: **Video tutorial:** [Introduction to Bare Metal Cloud](https://www.youtube.com/watch?v=8TLsqgLDMN4)

## Installing Pulumi locally
Check out this official tutorial to learn how to install Pulumi on your local machine. 

-   [How to Download and Install Pulumi](https://www.pulumi.com/docs/get-started/install/)

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @phoenixnap/pulumi-pnap
```

or `yarn`:

```bash
yarn add @phoenixnap/pulumi-pnap
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_pnap
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/phoenixnap/pulumi-pnap/sdk/go/...
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Phoenixnap.pulumi-pnap
```

## Configuration

The following configuration points are available for the `pnap` provider:

- `pnap:clientId` (environment: `PNAP_CLIENT_ID`) - your BMC OAuth client ID
- `pnap:clientSecret` (environment: `PNAP_CLIENT_SECRET`) - your BMC OAuth client secret
- `pnap:configFilePath` - path to your PNAP credentials file

<!-- ## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/pnap/api-docs/). -->
