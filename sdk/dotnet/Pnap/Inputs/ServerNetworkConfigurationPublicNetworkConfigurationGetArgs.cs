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

    public sealed class ServerNetworkConfigurationPublicNetworkConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("publicNetworks")]
        private InputList<Inputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkGetArgs>? _publicNetworks;
        public InputList<Inputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkGetArgs> PublicNetworks
        {
            get => _publicNetworks ?? (_publicNetworks = new InputList<Inputs.ServerNetworkConfigurationPublicNetworkConfigurationPublicNetworkGetArgs>());
            set => _publicNetworks = value;
        }

        public ServerNetworkConfigurationPublicNetworkConfigurationGetArgs()
        {
        }
        public static new ServerNetworkConfigurationPublicNetworkConfigurationGetArgs Empty => new ServerNetworkConfigurationPublicNetworkConfigurationGetArgs();
    }
}
