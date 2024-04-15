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
    public sealed class GetEventsEventResult
    {
        /// <summary>
        /// Event name.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The UTC time the event initiated.
        /// </summary>
        public readonly string Timestamp;
        /// <summary>
        /// Details related to the user / application.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEventsEventUserInfoResult> UserInfos;

        [OutputConstructor]
        private GetEventsEventResult(
            string name,

            string timestamp,

            ImmutableArray<Outputs.GetEventsEventUserInfoResult> userInfos)
        {
            Name = name;
            Timestamp = timestamp;
            UserInfos = userInfos;
        }
    }
}
