// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class RancherClusterNodePoolsSshConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Define whether public keys marked as default should be installed on this node. Default value is true.
        /// </summary>
        [Input("installDefaultKeys")]
        public Input<bool>? InstallDefaultKeys { get; set; }

        [Input("keyIds")]
        private InputList<string>? _keyIds;

        /// <summary>
        /// List of public SSH key identifiers.
        /// </summary>
        public InputList<string> KeyIds
        {
            get => _keyIds ?? (_keyIds = new InputList<string>());
            set => _keyIds = value;
        }

        [Input("keys")]
        private InputList<string>? _keys;

        /// <summary>
        /// List of public SSH keys.
        /// </summary>
        public InputList<string> Keys
        {
            get => _keys ?? (_keys = new InputList<string>());
            set => _keys = value;
        }

        public RancherClusterNodePoolsSshConfigArgs()
        {
        }
        public static new RancherClusterNodePoolsSshConfigArgs Empty => new RancherClusterNodePoolsSshConfigArgs();
    }
}
