// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP SSH key datasource. This can be used to read SSH keys.
//
// ## Example Usage
//
// # Fetch a SSH key by name and show it's key
//
// ```go
// package main
//
// import (
//
//	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := pnap.LookupSshKey(ctx, &pnap.LookupSshKeyArgs{
//				Name: pulumi.StringRef("test3"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("key", test.Key)
//			return nil
//		})
//	}
//
// ```
func LookupSshKey(ctx *pulumi.Context, args *LookupSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupSshKeyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSshKeyResult
	err := ctx.Invoke("pnap:index/getSshKey:getSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyArgs struct {
	// The unique identifier of the SSH Key.
	Id *string `pulumi:"id"`
	// Friendly SSH key name to represent an SSH key.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getSshKey.
type LookupSshKeyResult struct {
	// Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
	Default bool `pulumi:"default"`
	// The unique identifier of the SSH Key.
	Id string `pulumi:"id"`
	// SSH Key value.
	Key string `pulumi:"key"`
	// Friendly SSH key name to represent an SSH key.
	Name string `pulumi:"name"`
}

func LookupSshKeyOutput(ctx *pulumi.Context, args LookupSshKeyOutputArgs, opts ...pulumi.InvokeOption) LookupSshKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSshKeyResult, error) {
			args := v.(LookupSshKeyArgs)
			r, err := LookupSshKey(ctx, &args, opts...)
			var s LookupSshKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSshKeyResultOutput)
}

// A collection of arguments for invoking getSshKey.
type LookupSshKeyOutputArgs struct {
	// The unique identifier of the SSH Key.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// Friendly SSH key name to represent an SSH key.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupSshKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyArgs)(nil)).Elem()
}

// A collection of values returned by getSshKey.
type LookupSshKeyResultOutput struct{ *pulumi.OutputState }

func (LookupSshKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSshKeyResult)(nil)).Elem()
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutput() LookupSshKeyResultOutput {
	return o
}

func (o LookupSshKeyResultOutput) ToLookupSshKeyResultOutputWithContext(ctx context.Context) LookupSshKeyResultOutput {
	return o
}

// Keys marked as default are always included on server creation and reset unless toggled off in creation/reset request.
func (o LookupSshKeyResultOutput) Default() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupSshKeyResult) bool { return v.Default }).(pulumi.BoolOutput)
}

// The unique identifier of the SSH Key.
func (o LookupSshKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

// SSH Key value.
func (o LookupSshKeyResultOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Key }).(pulumi.StringOutput)
}

// Friendly SSH key name to represent an SSH key.
func (o LookupSshKeyResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSshKeyResult) string { return v.Name }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSshKeyResultOutput{})
}
