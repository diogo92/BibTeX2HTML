<#list IncollectionList as IncollectionData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${IncollectionData.citationKey}</li>
			<li><strong>Author:</strong> ${IncollectionData.author}</li>
			<li><strong>Title:</strong> ${IncollectionData.title}</li>
			<li><strong>Book Title:</strong> ${IncollectionData.booktitle}</li>
			<li><strong>Publisher:</strong> ${IncollectionData.publisher}</li>
			<li><strong>Year:</strong> ${IncollectionData.year}</li>
			<#if IncollectionData.editor??>
				<li><strong>Editor:</strong> ${IncollectionData.editor}</li>
			</#if>
			<#if IncollectionData.volume??>
				<li><strong>Volume:</strong> ${IncollectionData.volume}</li>
			</#if>
			<#if IncollectionData.series??>
				<li><strong>Series:</strong> ${IncollectionData.series}</li>
			</#if>
			<#if IncollectionData.type??>
				<li><strong>Type:</strong> ${IncollectionData.type}</li>
			</#if>
			<#if IncollectionData.chapter??>
				<li><strong>Chapter:</strong> ${IncollectionData.chapter}</li>
			</#if>
			<#if IncollectionData.pages??>
				<li><strong>Pages:</strong> ${IncollectionData.pages}</li>
			</#if>
			<#if IncollectionData.address??>
				<li><strong>Address:</strong> ${IncollectionData.address}</li>
			</#if>
			<#if IncollectionData.edition??>
				<li><strong>Edition:</strong> ${IncollectionData.edition}</li>
			</#if>
			<#if IncollectionData.month??>
				<li><strong>Month:</strong> ${IncollectionData.month}</li>
			</#if>
			<#if IncollectionData.note??>
				<li><strong>Note:</strong> ${IncollectionData.note}</li>
			</#if>
			<#if IncollectionData.key??>
				<li><strong>Key:</strong> ${IncollectionData.key}</li>
			</#if>
		</ul>
	</div>
</#list>