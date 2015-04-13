<#list InbookList as InbookData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${InbookData.citationKey}</li>
			<li><strong>Author:</strong> ${InbookData.author}</li>
			<li><strong>Title:</strong> ${InbookData.title}</li>
			<li><strong>Chapter:</strong> ${InbookData.chapter}</li>
			<#if InbookData.pages??>
				<li><strong>Pages:</strong> ${InbookData.pages}</li>
			</#if>
			<li><strong>Publisher:</strong> ${InbookData.publisher}</li>
			<li><strong>Year:</strong> ${InbookData.year}</li>
			<#if InbookData.volume??>
				<li><strong>Volume:</strong> ${InbookData.volume}</li>
			</#if>
			<#if InbookData.series??>
				<li><strong>Series:</strong> ${InbookData.series}</li>
			</#if>

			<#if InbookData.type??>
				<li><strong>Type:</strong> ${InbookData.type}</li>
			</#if>
			<#if InbookData.address??>
				<li><strong>Address:</strong> ${InbookData.address}</li>
			</#if>
			<#if InbookData.edition??>
				<li><strong>Edition:</strong> ${InbookData.edition}</li>
			</#if>
			<#if InbookData.month??>
				<li><strong>Month:</strong> ${InbookData.month}</li>
			</#if>
			<#if InbookData.note??>
				<li><strong>Note:</strong> ${InbookData.note}</li>
			</#if>
			<#if InbookData.key??>
				<li><strong>Key:</strong> ${InbookData.key}</li>
			</#if>
		</ul>
	</div>
</#list>