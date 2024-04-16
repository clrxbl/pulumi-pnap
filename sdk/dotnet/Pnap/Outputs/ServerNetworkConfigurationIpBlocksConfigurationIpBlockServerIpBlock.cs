// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap.Outputs
{

    [OutputType]
    public sealed class ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock
    {
        /// <summary>
        /// The network identifier.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The VLAN on which this IP block has been configured within the network switch.
        /// 
        /// The `public_network_configuration` is the fourth field of the `network_configuration` block.
        /// The `public_network_configuration` block has field `public_networks`:
        /// 
        /// The `public_networks` block has field `server_public_network`.
        /// The `server_public_network` block has 2 fields:
        /// </summary>
        public readonly int? VlanId;

        [OutputConstructor]
        private ServerNetworkConfigurationIpBlocksConfigurationIpBlockServerIpBlock(
            string id,

            int? vlanId)
        {
            Id = id;
            VlanId = vlanId;
        }
    }
}