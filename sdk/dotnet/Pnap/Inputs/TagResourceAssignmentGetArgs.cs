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

    public sealed class TagResourceAssignmentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource name.
        /// </summary>
        [Input("resourceName")]
        public Input<string>? ResourceName { get; set; }

        /// <summary>
        /// The value of the tag assigned to the resource.
        /// * `created_by ` - The tag's creator.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public TagResourceAssignmentGetArgs()
        {
        }
        public static new TagResourceAssignmentGetArgs Empty => new TagResourceAssignmentGetArgs();
    }
}