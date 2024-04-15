// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package pnap

import (
	"context"
	"reflect"

	"github.com/phoenixnap/pulumi-pnap/sdk/go/pnap/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a phoenixNAP tag datasource. This can be used to read tags.
//
// ## Example Usage
//
// Fetch a tag by name and show it's details.
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
//			test, err := pnap.LookupTag(ctx, &pnap.LookupTagArgs{
//				Name: pulumi.StringRef("tag3"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("details", test)
//			return nil
//		})
//	}
//
// ```
func LookupTag(ctx *pulumi.Context, args *LookupTagArgs, opts ...pulumi.InvokeOption) (*LookupTagResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupTagResult
	err := ctx.Invoke("pnap:index/getTag:getTag", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getTag.
type LookupTagArgs struct {
	// The unique identifier of the tag.
	Id *string `pulumi:"id"`
	// The unique name of the tag.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getTag.
type LookupTagResult struct {
	CreatedBy string `pulumi:"createdBy"`
	// The description of the tag.
	// * ` isBillingTag  `- Whether or not to show the tag as part of billing and invoices.
	// * ` resourceAssignments  ` - The tag's assigned resources.
	Description string `pulumi:"description"`
	// The unique identifier of the tag.
	Id           string `pulumi:"id"`
	IsBillingTag bool   `pulumi:"isBillingTag"`
	// The name of the tag.
	Name                string                     `pulumi:"name"`
	ResourceAssignments []GetTagResourceAssignment `pulumi:"resourceAssignments"`
	// The optional values of the tag..
	Values []string `pulumi:"values"`
}

func LookupTagOutput(ctx *pulumi.Context, args LookupTagOutputArgs, opts ...pulumi.InvokeOption) LookupTagResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTagResult, error) {
			args := v.(LookupTagArgs)
			r, err := LookupTag(ctx, &args, opts...)
			var s LookupTagResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTagResultOutput)
}

// A collection of arguments for invoking getTag.
type LookupTagOutputArgs struct {
	// The unique identifier of the tag.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// The unique name of the tag.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupTagOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagArgs)(nil)).Elem()
}

// A collection of values returned by getTag.
type LookupTagResultOutput struct{ *pulumi.OutputState }

func (LookupTagResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTagResult)(nil)).Elem()
}

func (o LookupTagResultOutput) ToLookupTagResultOutput() LookupTagResultOutput {
	return o
}

func (o LookupTagResultOutput) ToLookupTagResultOutputWithContext(ctx context.Context) LookupTagResultOutput {
	return o
}

func (o LookupTagResultOutput) CreatedBy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.CreatedBy }).(pulumi.StringOutput)
}

// The description of the tag.
// * ` isBillingTag  `- Whether or not to show the tag as part of billing and invoices.
// * ` resourceAssignments  ` - The tag's assigned resources.
func (o LookupTagResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Description }).(pulumi.StringOutput)
}

// The unique identifier of the tag.
func (o LookupTagResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupTagResultOutput) IsBillingTag() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupTagResult) bool { return v.IsBillingTag }).(pulumi.BoolOutput)
}

// The name of the tag.
func (o LookupTagResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTagResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupTagResultOutput) ResourceAssignments() GetTagResourceAssignmentArrayOutput {
	return o.ApplyT(func(v LookupTagResult) []GetTagResourceAssignment { return v.ResourceAssignments }).(GetTagResourceAssignmentArrayOutput)
}

// The optional values of the tag..
func (o LookupTagResultOutput) Values() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupTagResult) []string { return v.Values }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTagResultOutput{})
}
