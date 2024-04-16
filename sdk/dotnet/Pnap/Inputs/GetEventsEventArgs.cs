// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap.Inputs
{

    public sealed class GetEventsEventInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Event name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The UTC time the event initiated.
        /// </summary>
        [Input("timestamp", required: true)]
        public Input<string> Timestamp { get; set; } = null!;

        [Input("userInfos", required: true)]
        private InputList<Inputs.GetEventsEventUserInfoInputArgs>? _userInfos;

        /// <summary>
        /// Details related to the user / application.
        /// </summary>
        public InputList<Inputs.GetEventsEventUserInfoInputArgs> UserInfos
        {
            get => _userInfos ?? (_userInfos = new InputList<Inputs.GetEventsEventUserInfoInputArgs>());
            set => _userInfos = value;
        }

        public GetEventsEventInputArgs()
        {
        }
        public static new GetEventsEventInputArgs Empty => new GetEventsEventInputArgs();
    }
}