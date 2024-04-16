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
    public sealed class GetStorageNetworkVolumePermissionResult
    {
        /// <summary>
        /// NFS specific permissions on the volume.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetStorageNetworkVolumePermissionNfResult> Nfs;

        [OutputConstructor]
        private GetStorageNetworkVolumePermissionResult(ImmutableArray<Outputs.GetStorageNetworkVolumePermissionNfResult> nfs)
        {
            Nfs = nfs;
        }
    }
}