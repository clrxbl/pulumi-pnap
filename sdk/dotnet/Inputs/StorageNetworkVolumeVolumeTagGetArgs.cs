// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class StorageNetworkVolumeVolumeTagGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Tag to set to the volume.
        /// </summary>
        [Input("tagAssignment")]
        public Input<Inputs.StorageNetworkVolumeVolumeTagTagAssignmentGetArgs>? TagAssignment { get; set; }

        public StorageNetworkVolumeVolumeTagGetArgs()
        {
        }
        public static new StorageNetworkVolumeVolumeTagGetArgs Empty => new StorageNetworkVolumeVolumeTagGetArgs();
    }
}
