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
    public sealed class ServerNetrisController
    {
        /// <summary>
        /// Host OS on which the Netris Softgate is installed.
        /// </summary>
        public readonly string? HostOs;
        /// <summary>
        /// Auto-generated password set for user 'netris' in the web console.
        /// </summary>
        public readonly string? NetrisUserPassword;
        /// <summary>
        /// The URL for the Netris Controller web console.
        /// </summary>
        public readonly string? NetrisWebConsoleUrl;

        [OutputConstructor]
        private ServerNetrisController(
            string? hostOs,

            string? netrisUserPassword,

            string? netrisWebConsoleUrl)
        {
            HostOs = hostOs;
            NetrisUserPassword = netrisUserPassword;
            NetrisWebConsoleUrl = netrisWebConsoleUrl;
        }
    }
}
