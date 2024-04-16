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
    /// Provides a phoenixNAP Public Network resource. This can be used to create,
    /// modify, and delete public networks.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Pnap = PhoenixNAP.Pulumi.Pnap;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Create a public network
    ///     var public_Network_1 = new Pnap.PublicNetwork("public-Network-1", new()
    ///     {
    ///         Description = "First public network.",
    ///         IpBlocks = new[]
    ///         {
    ///             new Pnap.Inputs.PublicNetworkIpBlockArgs
    ///             {
    ///                 AssignedIpBlock = new Pnap.Inputs.PublicNetworkIpBlockPublicNetworkIpBlockArgs
    ///                 {
    ///                     Id = "60473a6115e34466c9f8f083",
    ///                 },
    ///             },
    ///             new Pnap.Inputs.PublicNetworkIpBlockArgs
    ///             {
    ///                 AssignedIpBlock = new Pnap.Inputs.PublicNetworkIpBlockPublicNetworkIpBlockArgs
    ///                 {
    ///                     Id = "616e6ec6d66b406a45ab8797",
    ///                 },
    ///             },
    ///         },
    ///         Location = "PHX",
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [PnapResourceType("pnap:index/publicNetwork:PublicNetwork")]
    public partial class PublicNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Date and time when this public network was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// The description of this public network.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A list of IP Blocks that will be associated with this public network (10 items at most).
        /// </summary>
        [Output("ipBlocks")]
        public Output<ImmutableArray<Outputs.PublicNetworkIpBlock>> IpBlocks { get; private set; } = null!;

        /// <summary>
        /// The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
        /// * `vlan_id `- The VLAN that will be assigned to this network.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// A list of resources that are members of this public network.
        /// </summary>
        [Output("memberships")]
        public Output<ImmutableArray<Outputs.PublicNetworkMembership>> Memberships { get; private set; } = null!;

        /// <summary>
        /// The friendly name of this public network. This name should be unique.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The status of the public network.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        [Output("vlanId")]
        public Output<int> VlanId { get; private set; } = null!;


        /// <summary>
        /// Create a PublicNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PublicNetwork(string name, PublicNetworkArgs args, CustomResourceOptions? options = null)
            : base("pnap:index/publicNetwork:PublicNetwork", name, args ?? new PublicNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PublicNetwork(string name, Input<string> id, PublicNetworkState? state = null, CustomResourceOptions? options = null)
            : base("pnap:index/publicNetwork:PublicNetwork", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PublicNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PublicNetwork Get(string name, Input<string> id, PublicNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new PublicNetwork(name, id, state, options);
        }
    }

    public sealed class PublicNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of this public network.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ipBlocks")]
        private InputList<Inputs.PublicNetworkIpBlockArgs>? _ipBlocks;

        /// <summary>
        /// A list of IP Blocks that will be associated with this public network (10 items at most).
        /// </summary>
        public InputList<Inputs.PublicNetworkIpBlockArgs> IpBlocks
        {
            get => _ipBlocks ?? (_ipBlocks = new InputList<Inputs.PublicNetworkIpBlockArgs>());
            set => _ipBlocks = value;
        }

        /// <summary>
        /// The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
        /// * `vlan_id `- The VLAN that will be assigned to this network.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The friendly name of this public network. This name should be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public PublicNetworkArgs()
        {
        }
        public static new PublicNetworkArgs Empty => new PublicNetworkArgs();
    }

    public sealed class PublicNetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Date and time when this public network was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// The description of this public network.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ipBlocks")]
        private InputList<Inputs.PublicNetworkIpBlockGetArgs>? _ipBlocks;

        /// <summary>
        /// A list of IP Blocks that will be associated with this public network (10 items at most).
        /// </summary>
        public InputList<Inputs.PublicNetworkIpBlockGetArgs> IpBlocks
        {
            get => _ipBlocks ?? (_ipBlocks = new InputList<Inputs.PublicNetworkIpBlockGetArgs>());
            set => _ipBlocks = value;
        }

        /// <summary>
        /// The location of this public network. Supported values are `PHX`, `ASH`, `SGP`, `NLD`, `CHI`, `SEA` and `AUS`.
        /// * `vlan_id `- The VLAN that will be assigned to this network.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        [Input("memberships")]
        private InputList<Inputs.PublicNetworkMembershipGetArgs>? _memberships;

        /// <summary>
        /// A list of resources that are members of this public network.
        /// </summary>
        public InputList<Inputs.PublicNetworkMembershipGetArgs> Memberships
        {
            get => _memberships ?? (_memberships = new InputList<Inputs.PublicNetworkMembershipGetArgs>());
            set => _memberships = value;
        }

        /// <summary>
        /// The friendly name of this public network. This name should be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The status of the public network.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("vlanId")]
        public Input<int>? VlanId { get; set; }

        public PublicNetworkState()
        {
        }
        public static new PublicNetworkState Empty => new PublicNetworkState();
    }
}