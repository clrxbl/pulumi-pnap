// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Provides a phoenixNAP SSH key datasource. This can be used to read SSH keys.
 *
 * ## Example Usage
 *
 * Fetch a SSH key by name and show it's key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getSshKey({
 *     name: "test3",
 * });
 * export const key = test.then(test => test.key);
 * ```
 */
export function getSshKey(args?: GetSshKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetSshKeyResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("pnap:index/getSshKey:getSshKey", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyArgs {
    /**
     * The unique identifier of the SSH Key.
     */
    id?: string;
    /**
     * Friendly SSH key name to represent an SSH key.
     */
    name?: string;
}

/**
 * A collection of values returned by getSshKey.
 */
export interface GetSshKeyResult {
    /**
     * Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
     */
    readonly default: boolean;
    /**
     * The unique identifier of the SSH Key.
     */
    readonly id: string;
    /**
     * SSH Key value.
     */
    readonly key: string;
    /**
     * Friendly SSH key name to represent an SSH key.
     */
    readonly name: string;
}
/**
 * Provides a phoenixNAP SSH key datasource. This can be used to read SSH keys.
 *
 * ## Example Usage
 *
 * Fetch a SSH key by name and show it's key
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pnap from "@pulumi/pnap";
 *
 * const test = pnap.getSshKey({
 *     name: "test3",
 * });
 * export const key = test.then(test => test.key);
 * ```
 */
export function getSshKeyOutput(args?: GetSshKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSshKeyResult> {
    return pulumi.output(args).apply((a: any) => getSshKey(a, opts))
}

/**
 * A collection of arguments for invoking getSshKey.
 */
export interface GetSshKeyOutputArgs {
    /**
     * The unique identifier of the SSH Key.
     */
    id?: pulumi.Input<string>;
    /**
     * Friendly SSH key name to represent an SSH key.
     */
    name?: pulumi.Input<string>;
}
