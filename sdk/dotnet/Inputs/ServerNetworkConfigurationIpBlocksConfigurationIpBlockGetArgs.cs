// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class ServerNetworkConfigurationIpBlocksConfigurationIpBlockGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("serverIpBlock")]
        public Input<Inputs.ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlockGetArgs>? ServerIpBlock { get; set; }

        public ServerNetworkConfigurationIpBlocksConfigurationIpBlockGetArgs()
        {
        }
        public static new ServerNetworkConfigurationIpBlocksConfigurationIpBlockGetArgs Empty => new ServerNetworkConfigurationIpBlocksConfigurationIpBlockGetArgs();
    }
}
