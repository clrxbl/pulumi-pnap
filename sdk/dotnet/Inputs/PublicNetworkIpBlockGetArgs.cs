// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class PublicNetworkIpBlockGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The assigned IP Block to the public network.
        /// </summary>
        [Input("publicNetworkIpBlock")]
        public Input<Inputs.PublicNetworkIpBlockPublicNetworkIpBlockGetArgs>? AssignedIpBlock { get; set; }

        public PublicNetworkIpBlockGetArgs()
        {
        }
        public static new PublicNetworkIpBlockGetArgs Empty => new PublicNetworkIpBlockGetArgs();
    }
}
