// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP Rancher Cluster resource. This can be used to create and delete Rancher Server deployments.
 *
 * ## Example Usage
 *
 * Create a Rancher Cluster
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@phoenixnap/pulumi-pnap";
 *
 * // Create a Rancher Cluster
 * const rancher_Deployment_1 = new pnap.RancherCluster("rancher-Deployment-1", {
 *     description: "A Rancher Server deployment with specific server type.",
 *     location: "PHX",
 *     nodePools: {
 *         nodeCount: 1,
 *         serverType: "s1.c1.medium",
 *         sshConfig: {
 *             installDefaultKeys: false,
 *             keys: [
 *                 "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDF9LdAFElNCi7JoWh6KUcchrJ2Gac1aqGRPpdZNowObpRtmiRCecAMb7bUgNAaNfcmwiQi7tos9TlnFgprIcfMWb8MSs3ABYHmBgqEEt3RWYf0fAc9CsIpJdMCUG28TPGTlRXCEUVNKgLMdcseAlJoGp1CgbHWIN65fB3he3kAZcfpPn5mapV0tsl2p+ZyuAGRYdn5dJv2RZDHUZBkOeUobwsij+weHCKAFmKQKtCP7ybgVHaQjAPrj8MGnk1jBbjDt5ws+Be+9JNjQJee9zCKbAOsIo3i+GcUIkrw5jxPU/RTGlWBcemPaKHdciSzGcjWboapzIy49qypQhZe1U75 userOne",
 *                 "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDF9LdAFElNCi7JoWh6KUcchrJ2Gac1aqGRPpdZNowObpRtmiRCecAMb7bUgNAaNfcmwiQi7tos9TlnFgprIcfMWb8MSs3ABYHmBgqEEt3RWYf0fAc9CsIpJdMCUG28TPGTlRXCEUVNKgLMdcseAlJoGp1CgbHWIN65fB3he3kAZcfpPn5mapV0tsl2p+ZyuAGRYdn5dJv2RZDHUZBkOeUobwsij+weHCKAFmKQKtCP7ybgVHaQjAPrj8MGnk1jBbjDt5ws+Be+9JNjQJee9zCKbAOsIo3i+GcUIkrw5jxPU/RTGlWBcemPaKHdciSzGcjWboapzIy49qypQhZe1U75 userTwo",
 *             ],
 *         },
 *     },
 * });
 * ```
 */
export class RancherCluster extends pulumi.CustomResource {
    /**
     * Get an existing RancherCluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RancherClusterState, opts?: pulumi.CustomResourceOptions): RancherCluster {
        return new RancherCluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pnap:index/rancherCluster:RancherCluster';

    /**
     * Returns true if the given object is an instance of RancherCluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RancherCluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RancherCluster.__pulumiType;
    }

    /**
     * Rancher configuration parameters. The `configuration` block has 7 fields.
     */
    public readonly configuration!: pulumi.Output<outputs.RancherClusterConfiguration | undefined>;
    /**
     * Cluster description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The Rancher version that was installed on the cluster during the first creation process.
     */
    public /*out*/ readonly initialClusterVersion!: pulumi.Output<string>;
    /**
     * Workload cluster location. Cannot be changed once the cluster is created. For a full list of allowed locations visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Connection parameters to use to connect to the Rancher Server Administrative GUI.
     */
    public /*out*/ readonly metadatas!: pulumi.Output<outputs.RancherClusterMetadata[]>;
    /**
     * The name of the workload cluster. This field is autogenerated if not provided.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The node pools associated with the cluster (must contain exactly one item). The `nodePools` block has 4 fields.
     */
    public readonly nodePools!: pulumi.Output<outputs.RancherClusterNodePools>;
    /**
     * The cluster status.
     */
    public /*out*/ readonly statusDescription!: pulumi.Output<string>;
    /**
     * Workload cluster configuration parameters. The `workloadConfiguration` block has 4 fields.
     */
    public readonly workloadConfiguration!: pulumi.Output<outputs.RancherClusterWorkloadConfiguration | undefined>;

    /**
     * Create a RancherCluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RancherClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RancherClusterArgs | RancherClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RancherClusterState | undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["initialClusterVersion"] = state ? state.initialClusterVersion : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["metadatas"] = state ? state.metadatas : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodePools"] = state ? state.nodePools : undefined;
            resourceInputs["statusDescription"] = state ? state.statusDescription : undefined;
            resourceInputs["workloadConfiguration"] = state ? state.workloadConfiguration : undefined;
        } else {
            const args = argsOrState as RancherClusterArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodePools"] = args ? args.nodePools : undefined;
            resourceInputs["workloadConfiguration"] = args ? args.workloadConfiguration : undefined;
            resourceInputs["initialClusterVersion"] = undefined /*out*/;
            resourceInputs["metadatas"] = undefined /*out*/;
            resourceInputs["statusDescription"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RancherCluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RancherCluster resources.
 */
export interface RancherClusterState {
    /**
     * Rancher configuration parameters. The `configuration` block has 7 fields.
     */
    configuration?: pulumi.Input<inputs.RancherClusterConfiguration>;
    /**
     * Cluster description.
     */
    description?: pulumi.Input<string>;
    /**
     * The Rancher version that was installed on the cluster during the first creation process.
     */
    initialClusterVersion?: pulumi.Input<string>;
    /**
     * Workload cluster location. Cannot be changed once the cluster is created. For a full list of allowed locations visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     */
    location?: pulumi.Input<string>;
    /**
     * Connection parameters to use to connect to the Rancher Server Administrative GUI.
     */
    metadatas?: pulumi.Input<pulumi.Input<inputs.RancherClusterMetadata>[]>;
    /**
     * The name of the workload cluster. This field is autogenerated if not provided.
     */
    name?: pulumi.Input<string>;
    /**
     * The node pools associated with the cluster (must contain exactly one item). The `nodePools` block has 4 fields.
     */
    nodePools?: pulumi.Input<inputs.RancherClusterNodePools>;
    /**
     * The cluster status.
     */
    statusDescription?: pulumi.Input<string>;
    /**
     * Workload cluster configuration parameters. The `workloadConfiguration` block has 4 fields.
     */
    workloadConfiguration?: pulumi.Input<inputs.RancherClusterWorkloadConfiguration>;
}

/**
 * The set of arguments for constructing a RancherCluster resource.
 */
export interface RancherClusterArgs {
    /**
     * Rancher configuration parameters. The `configuration` block has 7 fields.
     */
    configuration?: pulumi.Input<inputs.RancherClusterConfiguration>;
    /**
     * Cluster description.
     */
    description?: pulumi.Input<string>;
    /**
     * Workload cluster location. Cannot be changed once the cluster is created. For a full list of allowed locations visit [API docs](https://developers.phoenixnap.com/docs/rancher/1)
     */
    location: pulumi.Input<string>;
    /**
     * The name of the workload cluster. This field is autogenerated if not provided.
     */
    name?: pulumi.Input<string>;
    /**
     * The node pools associated with the cluster (must contain exactly one item). The `nodePools` block has 4 fields.
     */
    nodePools?: pulumi.Input<inputs.RancherClusterNodePools>;
    /**
     * Workload cluster configuration parameters. The `workloadConfiguration` block has 4 fields.
     */
    workloadConfiguration?: pulumi.Input<inputs.RancherClusterWorkloadConfiguration>;
}