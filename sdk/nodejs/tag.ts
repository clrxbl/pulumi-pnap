// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP tag resource. This can be used to create, modify, and delete tags.
 *
 * ## Example Usage
 *
 * Create a tag
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * // Create a tag
 * const tag_1 = new pnap.Tag("tag-1", {isBillingTag: false});
 * ```
 */
export class Tag extends pulumi.CustomResource {
    /**
     * Get an existing Tag resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TagState, opts?: pulumi.CustomResourceOptions): Tag {
        return new Tag(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'pnap:index/tag:Tag';

    /**
     * Returns true if the given object is an instance of Tag.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tag {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tag.__pulumiType;
    }

    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * The description of the tag.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Whether or not to show the tag as part of billing and invoices.
     */
    public readonly isBillingTag!: pulumi.Output<boolean>;
    /**
     * The unique name of the tag.
     */
    public readonly name!: pulumi.Output<string>;
    public /*out*/ readonly resourceAssignments!: pulumi.Output<outputs.TagResourceAssignment[]>;
    /**
     * The optional values of the tag..
     */
    public /*out*/ readonly values!: pulumi.Output<string[]>;

    /**
     * Create a Tag resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TagArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TagArgs | TagState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TagState | undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["isBillingTag"] = state ? state.isBillingTag : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["resourceAssignments"] = state ? state.resourceAssignments : undefined;
            resourceInputs["values"] = state ? state.values : undefined;
        } else {
            const args = argsOrState as TagArgs | undefined;
            if ((!args || args.isBillingTag === undefined) && !opts.urn) {
                throw new Error("Missing required property 'isBillingTag'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["isBillingTag"] = args ? args.isBillingTag : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["resourceAssignments"] = undefined /*out*/;
            resourceInputs["values"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tag.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tag resources.
 */
export interface TagState {
    createdBy?: pulumi.Input<string>;
    /**
     * The description of the tag.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether or not to show the tag as part of billing and invoices.
     */
    isBillingTag?: pulumi.Input<boolean>;
    /**
     * The unique name of the tag.
     */
    name?: pulumi.Input<string>;
    resourceAssignments?: pulumi.Input<pulumi.Input<inputs.TagResourceAssignment>[]>;
    /**
     * The optional values of the tag..
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Tag resource.
 */
export interface TagArgs {
    /**
     * The description of the tag.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether or not to show the tag as part of billing and invoices.
     */
    isBillingTag: pulumi.Input<boolean>;
    /**
     * The unique name of the tag.
     */
    name?: pulumi.Input<string>;
}
