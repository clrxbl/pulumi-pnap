// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Outputs
{

    [OutputType]
    public sealed class RancherClusterNodePoolsSshConfig
    {
        /// <summary>
        /// Define whether public keys marked as default should be installed on this node. Default value is true.
        /// </summary>
        public readonly bool? InstallDefaultKeys;
        /// <summary>
        /// List of public SSH key identifiers.
        /// </summary>
        public readonly ImmutableArray<string> KeyIds;
        /// <summary>
        /// List of public SSH keys.
        /// </summary>
        public readonly ImmutableArray<string> Keys;

        [OutputConstructor]
        private RancherClusterNodePoolsSshConfig(
            bool? installDefaultKeys,

            ImmutableArray<string> keyIds,

            ImmutableArray<string> keys)
        {
            InstallDefaultKeys = installDefaultKeys;
            KeyIds = keyIds;
            Keys = keys;
        }
    }
}
