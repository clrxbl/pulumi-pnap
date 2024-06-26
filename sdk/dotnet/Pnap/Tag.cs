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
    /// <summary>
    /// Provides a phoenixNAP tag resource. This can be used to create, modify, and delete tags.
    /// 
    /// ## Example Usage
    /// 
    /// Create a tag
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pnap = PhoenixNAP.Pulumi.Pnap;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a tag
    ///     var tag_1 = new Pnap.Tag("tag-1", new()
    ///     {
    ///         IsBillingTag = false,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [PnapResourceType("pnap:index/tag:Tag")]
    public partial class Tag : global::Pulumi.CustomResource
    {
        [Output("createdBy")]
        public Output<string> CreatedBy { get; private set; } = null!;

        /// <summary>
        /// The description of the tag.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether or not to show the tag as part of billing and invoices.
        /// </summary>
        [Output("isBillingTag")]
        public Output<bool> IsBillingTag { get; private set; } = null!;

        /// <summary>
        /// The unique name of the tag.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("resourceAssignments")]
        public Output<ImmutableArray<Outputs.TagResourceAssignment>> ResourceAssignments { get; private set; } = null!;

        /// <summary>
        /// The optional values of the tag..
        /// </summary>
        [Output("values")]
        public Output<ImmutableArray<string>> Values { get; private set; } = null!;


        /// <summary>
        /// Create a Tag resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Tag(string name, TagArgs args, CustomResourceOptions? options = null)
            : base("pnap:index/tag:Tag", name, args ?? new TagArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Tag(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
            : base("pnap:index/tag:Tag", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Tag resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Tag Get(string name, Input<string> id, TagState? state = null, CustomResourceOptions? options = null)
        {
            return new Tag(name, id, state, options);
        }
    }

    public sealed class TagArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the tag.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether or not to show the tag as part of billing and invoices.
        /// </summary>
        [Input("isBillingTag", required: true)]
        public Input<bool> IsBillingTag { get; set; } = null!;

        /// <summary>
        /// The unique name of the tag.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TagArgs()
        {
        }
        public static new TagArgs Empty => new TagArgs();
    }

    public sealed class TagState : global::Pulumi.ResourceArgs
    {
        [Input("createdBy")]
        public Input<string>? CreatedBy { get; set; }

        /// <summary>
        /// The description of the tag.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether or not to show the tag as part of billing and invoices.
        /// </summary>
        [Input("isBillingTag")]
        public Input<bool>? IsBillingTag { get; set; }

        /// <summary>
        /// The unique name of the tag.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("resourceAssignments")]
        private InputList<Inputs.TagResourceAssignmentGetArgs>? _resourceAssignments;
        public InputList<Inputs.TagResourceAssignmentGetArgs> ResourceAssignments
        {
            get => _resourceAssignments ?? (_resourceAssignments = new InputList<Inputs.TagResourceAssignmentGetArgs>());
            set => _resourceAssignments = value;
        }

        [Input("values")]
        private InputList<string>? _values;

        /// <summary>
        /// The optional values of the tag..
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public TagState()
        {
        }
        public static new TagState Empty => new TagState();
    }
}
