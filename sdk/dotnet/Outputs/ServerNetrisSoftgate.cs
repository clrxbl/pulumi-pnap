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
    public sealed class ServerNetrisSoftgate
    {
        /// <summary>
        /// IP address or hostname through which to reach the Netris Controller.
        /// </summary>
        public readonly string? ControllerAddress;
        /// <summary>
        /// The authentication key of the Netris Controller to connect to. Required for the softgate agent to be able to interact with the Netris Controller.
        /// 
        /// 
        /// The `tags` block has field `tag_assignment`.
        /// The `tag_assignment` block has 2 fields:
        /// </summary>
        public readonly string? ControllerAuthKey;
        /// <summary>
        /// The version of the Netris Controller to connect to.
        /// </summary>
        public readonly string? ControllerVersion;
        /// <summary>
        /// Host OS on which the Netris Softgate is installed.
        /// </summary>
        public readonly string? HostOs;

        [OutputConstructor]
        private ServerNetrisSoftgate(
            string? controllerAddress,

            string? controllerAuthKey,

            string? controllerVersion,

            string? hostOs)
        {
            ControllerAddress = controllerAddress;
            ControllerAuthKey = controllerAuthKey;
            ControllerVersion = controllerVersion;
            HostOs = hostOs;
        }
    }
}
