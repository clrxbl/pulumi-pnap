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

    public sealed class ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverPublicNetwork")]
        public Input<Inputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkServerPublicNetworkArgs>? ServerPublicNetwork { get; set; }

        public ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs()
        {
        }
        public static new ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs Empty => new ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkArgs();
    }
}