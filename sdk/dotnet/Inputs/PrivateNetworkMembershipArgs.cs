// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class PrivateNetworkMembershipArgs : global::Pulumi.ResourceArgs
    {
        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// List of public IPs associated to the resource.
        /// </summary>
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// The resource identifier.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        /// <summary>
        /// The resource's type.
        /// </summary>
        [Input("resourceType")]
        public Input<string>? ResourceType { get; set; }

        public PrivateNetworkMembershipArgs()
        {
        }
        public static new PrivateNetworkMembershipArgs Empty => new PrivateNetworkMembershipArgs();
    }
}
