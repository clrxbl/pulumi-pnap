// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap
{
    public static class GetIpBlock
    {
        /// <summary>
        /// Provides a phoenixNAP IP Block datasource. This can be used to read IP Blocks.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch an IP Block by CIDR and show it's details in alphabetical order
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Pnap.GetIpBlock.Invoke(new()
        ///     {
        ///         Cidr = "1.1.1.0/31",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ip-block"] = test,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIpBlockResult> InvokeAsync(GetIpBlockArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpBlockResult>("pnap:index/getIpBlock:getIpBlock", args ?? new GetIpBlockArgs(), options.WithDefaults());

        /// <summary>
        /// Provides a phoenixNAP IP Block datasource. This can be used to read IP Blocks.
        /// 
        /// 
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Fetch an IP Block by CIDR and show it's details in alphabetical order
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Pnap = Pulumi.Pnap;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Pnap.GetIpBlock.Invoke(new()
        ///     {
        ///         Cidr = "1.1.1.0/31",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["ip-block"] = test,
        ///     };
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIpBlockResult> Invoke(GetIpBlockInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpBlockResult>("pnap:index/getIpBlock:getIpBlock", args ?? new GetIpBlockInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpBlockArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IP Block in CIDR notation.
        /// </summary>
        [Input("cidr")]
        public string? Cidr { get; set; }

        /// <summary>
        /// The IP Block identifier.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        public GetIpBlockArgs()
        {
        }
        public static new GetIpBlockArgs Empty => new GetIpBlockArgs();
    }

    public sealed class GetIpBlockInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The IP Block in CIDR notation.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// The IP Block identifier.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        public GetIpBlockInvokeArgs()
        {
        }
        public static new GetIpBlockInvokeArgs Empty => new GetIpBlockInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpBlockResult
    {
        /// <summary>
        /// ID of the resource assigned to the IP Block.
        /// * `assigned_resource_type `- Type of the resource assigned to the IP Block.
        /// </summary>
        public readonly string AssignedResourceId;
        public readonly string AssignedResourceType;
        /// <summary>
        /// The IP Block in CIDR notation.
        /// </summary>
        public readonly string Cidr;
        /// <summary>
        /// CIDR IP Block Size.
        /// </summary>
        public readonly string CidrBlockSize;
        /// <summary>
        /// Date and time when the IP Block was created.
        /// </summary>
        public readonly string CreatedOn;
        /// <summary>
        /// Description of the IP Block.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The unique id of the tag.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// True if the IP Block is a "bring your own" block.
        /// </summary>
        public readonly bool IsBringYourOwn;
        /// <summary>
        /// IP Block location ID.
        /// </summary>
        public readonly string Location;
        /// <summary>
        /// The status of the IP Block.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The tags assigned to the IP Block.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetIpBlockTagResult> Tags;

        [OutputConstructor]
        private GetIpBlockResult(
            string assignedResourceId,

            string assignedResourceType,

            string cidr,

            string cidrBlockSize,

            string createdOn,

            string description,

            string id,

            bool isBringYourOwn,

            string location,

            string status,

            ImmutableArray<Outputs.GetIpBlockTagResult> tags)
        {
            AssignedResourceId = assignedResourceId;
            AssignedResourceType = assignedResourceType;
            Cidr = cidr;
            CidrBlockSize = cidrBlockSize;
            CreatedOn = createdOn;
            Description = description;
            Id = id;
            IsBringYourOwn = isBringYourOwn;
            Location = location;
            Status = status;
            Tags = tags;
        }
    }
}
