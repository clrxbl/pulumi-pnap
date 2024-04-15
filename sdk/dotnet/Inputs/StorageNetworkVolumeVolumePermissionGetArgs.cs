// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class StorageNetworkVolumeVolumePermissionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("nfs")]
        private InputList<Inputs.StorageNetworkVolumeVolumePermissionNfGetArgs>? _nfs;

        /// <summary>
        /// NFS specific permissions on the volume.
        /// </summary>
        public InputList<Inputs.StorageNetworkVolumeVolumePermissionNfGetArgs> Nfs
        {
            get => _nfs ?? (_nfs = new InputList<Inputs.StorageNetworkVolumeVolumePermissionNfGetArgs>());
            set => _nfs = value;
        }

        public StorageNetworkVolumeVolumePermissionGetArgs()
        {
        }
        public static new StorageNetworkVolumeVolumePermissionGetArgs Empty => new StorageNetworkVolumeVolumePermissionGetArgs();
    }
}
