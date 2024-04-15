// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class StorageNetworkVolumeVolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Capacity of volume in GB. Currently only whole numbers and multiples of 1000 GB are supported.
        /// </summary>
        [Input("capacityInGb", required: true)]
        public Input<int> CapacityInGb { get; set; } = null!;

        /// <summary>
        /// Date and time when this volume was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Date and time of the initial request for volume deletion.
        /// </summary>
        [Input("deleteRequestedOn")]
        public Input<string>? DeleteRequestedOn { get; set; }

        /// <summary>
        /// Volume description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique id of the tag.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The name of the tag.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Volume's full path. It is in form of `/{volumeId}/pathSuffix`.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// Last part of volume's path.
        /// </summary>
        [Input("pathSuffix")]
        public Input<string>? PathSuffix { get; set; }

        [Input("permissions")]
        private InputList<Inputs.StorageNetworkVolumeVolumePermissionArgs>? _permissions;

        /// <summary>
        /// Permissions for the volume.
        /// </summary>
        public InputList<Inputs.StorageNetworkVolumeVolumePermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.StorageNetworkVolumeVolumePermissionArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// File system protocol.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Volume's status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.StorageNetworkVolumeVolumeTagArgs>? _tags;

        /// <summary>
        /// Tags to set to the volume.
        /// </summary>
        public InputList<Inputs.StorageNetworkVolumeVolumeTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.StorageNetworkVolumeVolumeTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// Used capacity in GB, updated periodically.
        /// </summary>
        [Input("usedCapacityInGb")]
        public Input<int>? UsedCapacityInGb { get; set; }

        public StorageNetworkVolumeVolumeArgs()
        {
        }
        public static new StorageNetworkVolumeVolumeArgs Empty => new StorageNetworkVolumeVolumeArgs();
    }
}
