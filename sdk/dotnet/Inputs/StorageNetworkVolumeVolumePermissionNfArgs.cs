// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class StorageNetworkVolumeVolumePermissionNfArgs : global::Pulumi.ResourceArgs
    {
        [Input("allSquashes")]
        private InputList<string>? _allSquashes;

        /// <summary>
        /// All squash permission.
        /// </summary>
        public InputList<string> AllSquashes
        {
            get => _allSquashes ?? (_allSquashes = new InputList<string>());
            set => _allSquashes = value;
        }

        [Input("noSquashes")]
        private InputList<string>? _noSquashes;

        /// <summary>
        /// No squash permission.
        /// </summary>
        public InputList<string> NoSquashes
        {
            get => _noSquashes ?? (_noSquashes = new InputList<string>());
            set => _noSquashes = value;
        }

        [Input("readOnlies")]
        private InputList<string>? _readOnlies;

        /// <summary>
        /// Read only access.
        /// </summary>
        public InputList<string> ReadOnlies
        {
            get => _readOnlies ?? (_readOnlies = new InputList<string>());
            set => _readOnlies = value;
        }

        [Input("readWrites")]
        private InputList<string>? _readWrites;

        /// <summary>
        /// Read/Write access.
        /// </summary>
        public InputList<string> ReadWrites
        {
            get => _readWrites ?? (_readWrites = new InputList<string>());
            set => _readWrites = value;
        }

        [Input("rootSquashes")]
        private InputList<string>? _rootSquashes;

        /// <summary>
        /// Root squash permission.
        /// </summary>
        public InputList<string> RootSquashes
        {
            get => _rootSquashes ?? (_rootSquashes = new InputList<string>());
            set => _rootSquashes = value;
        }

        public StorageNetworkVolumeVolumePermissionNfArgs()
        {
        }
        public static new StorageNetworkVolumeVolumePermissionNfArgs Empty => new StorageNetworkVolumeVolumePermissionNfArgs();
    }
}
