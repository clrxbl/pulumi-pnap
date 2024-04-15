// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Pnap
{
    /// <summary>
    /// Provides a phoenixNAP IP Block resource. This can be used to create, modify and delete IP Blocks.
    /// 
    /// ## Example Usage
    /// 
    /// Create an IP Block
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pnap = Pulumi.Pnap;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create an IP Block
    ///     var ip_block_1 = new Pnap.IpBlock("ip-block-1", new()
    ///     {
    ///         CidrBlockSize = "/28",
    ///         Description = "IP Block #1 used for publicly accessing server #1.",
    ///         Location = "PHX",
    ///         Tags = new[]
    ///         {
    ///             new Pnap.Inputs.IpBlockTagArgs
    ///             {
    ///                 TagAssignment = new Pnap.Inputs.IpBlockTagTagAssignmentArgs
    ///                 {
    ///                     Name = "tag-1",
    ///                     Value = "PROD",
    ///                 },
    ///             },
    ///             new Pnap.Inputs.IpBlockTagArgs
    ///             {
    ///                 TagAssignment = new Pnap.Inputs.IpBlockTagTagAssignmentArgs
    ///                 {
    ///                     Name = "tag-2",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [PnapResourceType("pnap:index/ipBlock:IpBlock")]
    public partial class IpBlock : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the resource assigned to the IP Block.
        /// * `assigned_resource_type `- Type of the resource assigned to the IP Block.
        /// </summary>
        [Output("assignedResourceId")]
        public Output<string> AssignedResourceId { get; private set; } = null!;

        [Output("assignedResourceType")]
        public Output<string> AssignedResourceType { get; private set; } = null!;

        /// <summary>
        /// The IP Block in CIDR notation.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// CIDR IP Block Size. Currently this field should be set to either `/31`, `/30`, `/29` or `/28`. For a larger Block Size contact support.
        /// </summary>
        [Output("cidrBlockSize")]
        public Output<string> CidrBlockSize { get; private set; } = null!;

        /// <summary>
        /// Date and time when the IP Block was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Description of the IP Block.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// True if the IP Block is a "bring your own" block.
        /// </summary>
        [Output("isBringYourOwn")]
        public Output<bool> IsBringYourOwn { get; private set; } = null!;

        /// <summary>
        /// IP Block location ID. Currently this field should be set to `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` or `AUS`.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The status of the IP Block.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Tags to set to IP Block, if any.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.IpBlockTag>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a IpBlock resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IpBlock(string name, IpBlockArgs args, CustomResourceOptions? options = null)
            : base("pnap:index/ipBlock:IpBlock", name, args ?? new IpBlockArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IpBlock(string name, Input<string> id, IpBlockState? state = null, CustomResourceOptions? options = null)
            : base("pnap:index/ipBlock:IpBlock", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/phoenixnap/pulumi-pnap/releases/",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing IpBlock resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IpBlock Get(string name, Input<string> id, IpBlockState? state = null, CustomResourceOptions? options = null)
        {
            return new IpBlock(name, id, state, options);
        }
    }

    public sealed class IpBlockArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// CIDR IP Block Size. Currently this field should be set to either `/31`, `/30`, `/29` or `/28`. For a larger Block Size contact support.
        /// </summary>
        [Input("cidrBlockSize", required: true)]
        public Input<string> CidrBlockSize { get; set; } = null!;

        /// <summary>
        /// Description of the IP Block.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// IP Block location ID. Currently this field should be set to `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` or `AUS`.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.IpBlockTagArgs>? _tags;

        /// <summary>
        /// Tags to set to IP Block, if any.
        /// </summary>
        public InputList<Inputs.IpBlockTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.IpBlockTagArgs>());
            set => _tags = value;
        }

        public IpBlockArgs()
        {
        }
        public static new IpBlockArgs Empty => new IpBlockArgs();
    }

    public sealed class IpBlockState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the resource assigned to the IP Block.
        /// * `assigned_resource_type `- Type of the resource assigned to the IP Block.
        /// </summary>
        [Input("assignedResourceId")]
        public Input<string>? AssignedResourceId { get; set; }

        [Input("assignedResourceType")]
        public Input<string>? AssignedResourceType { get; set; }

        /// <summary>
        /// The IP Block in CIDR notation.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// CIDR IP Block Size. Currently this field should be set to either `/31`, `/30`, `/29` or `/28`. For a larger Block Size contact support.
        /// </summary>
        [Input("cidrBlockSize")]
        public Input<string>? CidrBlockSize { get; set; }

        /// <summary>
        /// Date and time when the IP Block was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Description of the IP Block.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// True if the IP Block is a "bring your own" block.
        /// </summary>
        [Input("isBringYourOwn")]
        public Input<bool>? IsBringYourOwn { get; set; }

        /// <summary>
        /// IP Block location ID. Currently this field should be set to `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` or `AUS`.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The status of the IP Block.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.IpBlockTagGetArgs>? _tags;

        /// <summary>
        /// Tags to set to IP Block, if any.
        /// </summary>
        public InputList<Inputs.IpBlockTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.IpBlockTagGetArgs>());
            set => _tags = value;
        }

        public IpBlockState()
        {
        }
        public static new IpBlockState Empty => new IpBlockState();
    }
}
