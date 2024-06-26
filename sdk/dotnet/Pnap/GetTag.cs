// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace PhoenixNAP.Pulumi.Pnap
{
    public static class GetTag
    {
        /// <summary>
        /// Provides a phoenixNAP tag datasource. This can be used to read tags.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch a tag by name and show it's details.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Pnap.GetTag.Invoke(new()
        ///     {
        ///         Name = "tag3",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["details"] = test,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTagResult> InvokeAsync(GetTagArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTagResult>("pnap:index/getTag:getTag", args ?? new GetTagArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a phoenixNAP tag datasource. This can be used to read tags.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch a tag by name and show it's details.
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Pnap.GetTag.Invoke(new()
        ///     {
        ///         Name = "tag3",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["details"] = test,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTagResult> Invoke(GetTagInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTagResult>("pnap:index/getTag:getTag", args ?? new GetTagInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTagArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the tag.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        /// <summary>
        /// The unique name of the tag.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetTagArgs()
        {
        }
        public static new GetTagArgs Empty => new GetTagArgs();
    }

    public sealed class GetTagInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The unique identifier of the tag.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The unique name of the tag.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetTagInvokeArgs()
        {
        }
        public static new GetTagInvokeArgs Empty => new GetTagInvokeArgs();
    }


    [OutputType]
    public sealed class GetTagResult
    {
        public readonly string CreatedBy;
        /// <summary>
        /// The description of the tag.
        /// * `is_billing_tag `- Whether or not to show the tag as part of billing and invoices.
        /// * `resource_assignments ` - The tag's assigned resources.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique identifier of the tag.
        /// </summary>
        public readonly string Id;
        public readonly bool IsBillingTag;
        /// <summary>
        /// The name of the tag.
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetTagResourceAssignmentResult> ResourceAssignments;
        /// <summary>
        /// The optional values of the tag..
        /// </summary>
        public readonly ImmutableArray<string> Values;

        [OutputConstructor]
        private GetTagResult(
            string createdBy,

            string description,

            string id,

            bool isBillingTag,

            string name,

            ImmutableArray<Outputs.GetTagResourceAssignmentResult> resourceAssignments,

            ImmutableArray<string> values)
        {
            CreatedBy = createdBy;
            Description = description;
            Id = id;
            IsBillingTag = isBillingTag;
            Name = name;
            ResourceAssignments = resourceAssignments;
            Values = values;
        }
    }
}
