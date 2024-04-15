// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class ServerNetrisControllerGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Host OS on which the Netris Softgate is installed.
        /// </summary>
        [Input("hostOs")]
        public Input<string>? HostOs { get; set; }

        /// <summary>
        /// Auto-generated password set for user 'netris' in the web console.
        /// </summary>
        [Input("netrisUserPassword")]
        public Input<string>? NetrisUserPassword { get; set; }

        /// <summary>
        /// The URL for the Netris Controller web console.
        /// </summary>
        [Input("netrisWebConsoleUrl")]
        public Input<string>? NetrisWebConsoleUrl { get; set; }

        public ServerNetrisControllerGetArgs()
        {
        }
        public static new ServerNetrisControllerGetArgs Empty => new ServerNetrisControllerGetArgs();
    }
}
