// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap.Inputs
{

    public sealed class ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverPrivateNetwork")]
        public Input<Inputs.ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkServerPrivateNetworkGetArgs>? ServerPrivateNetwork { get; set; }

        public ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkGetArgs()
        {
        }
        public static new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkGetArgs Empty => new ServerNetworkConfigurationPrivateNetworkConfigurationPrivateNetworkGetArgs();
    }
}
