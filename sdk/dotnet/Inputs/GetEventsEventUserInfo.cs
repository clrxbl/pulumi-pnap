// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap.Inputs
{

    public sealed class GetEventsEventUserInfoArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The BMC account ID.
        /// </summary>
        [Input("accountId", required: true)]
        public string AccountId { get; set; } = null!;

        /// <summary>
        /// The client ID of the application.
        /// </summary>
        [Input("clientId", required: true)]
        public string ClientId { get; set; } = null!;

        /// <summary>
        /// The logged in user or owner of the client application.
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetEventsEventUserInfoArgs()
        {
        }
        public static new GetEventsEventUserInfoArgs Empty => new GetEventsEventUserInfoArgs();
    }
}
