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

    public sealed class PublicNetworkIpBlockPublicNetworkIpBlockArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP Block identifier.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public PublicNetworkIpBlockPublicNetworkIpBlockArgs()
        {
        }
        public static new PublicNetworkIpBlockPublicNetworkIpBlockArgs Empty => new PublicNetworkIpBlockPublicNetworkIpBlockArgs();
    }
}
