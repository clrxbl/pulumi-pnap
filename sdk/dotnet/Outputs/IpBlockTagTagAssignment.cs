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
    public sealed class IpBlockTagTagAssignment
    {
        /// <summary>
        /// Who the tag was created by.
        /// </summary>
        public readonly string? CreatedBy;
        /// <summary>
        /// The unique id of the tag.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Whether or not to show the tag as part of billing and invoices.
        /// </summary>
        public readonly bool? IsBillingTag;
        /// <summary>
        /// The name of the tag.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The value of the tag assigned to the IP Block.
        /// </summary>
        public readonly string? Value;

        [OutputConstructor]
        private IpBlockTagTagAssignment(
            string? createdBy,

            string? id,

            bool? isBillingTag,

            string name,

            string? value)
        {
            CreatedBy = createdBy;
            Id = id;
            IsBillingTag = isBillingTag;
            Name = name;
            Value = value;
        }
    }
}
